package com.learn.rocketmq;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.io.UnsupportedEncodingException;

public class Producer {
    public static void main(String[] args) throws MQClientException, RemotingException, MQBrokerException, InterruptedException, UnsupportedEncodingException {
        //01new一个默认的message queue 生产者，一定要给它一个名字
        DefaultMQProducer producer = new DefaultMQProducer("libo-1");
        //02给这个生产者设置注册的地址,本地的9876port
        producer.setNamesrvAddr("127.0.0.1:9876");
        //03启动producer,启动不代表发送了消息
        producer.start();
        //04准备要发送的Message，指定主题，标签，和消息
        Message msg = new Message("test1","tag1","李波".getBytes("utf-8"));
        //05因为发完消息后是需要有回馈的，发送结果（顾名思义）
        SendResult sendResult = producer.send(msg);
        System.out.println(sendResult);
        //06关闭producer
        producer.shutdown(); }
}


