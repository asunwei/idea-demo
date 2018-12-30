package com.learn.rocketmq;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.List;

public class Consumer {
    public static void main(String[] args) throws MQClientException {
        //01new 一个默认的推送消费者，同样要取个名字
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("liboconsumer");
        //02消费者同样要注册
        consumer.setNamesrvAddr("127.0.0.1:9876");
        //03消费者从队列的哪里开始拿消息呢？
        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);
        //04消费者订阅
        consumer.subscribe("test1", "*");
        //05用监听器接收,所以消费者需要注册一个监听器
        //参数只有一个，叫做当前的消息监听者，重写这个监听者的消费消息的方法
        //返回当前的消费状态（真正的参数）
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs, ConsumeConcurrentlyContext context) {
                try {
                    String str = new String(msgs.get(0).getBody(), "utf-8");
                    System.out.println(str);
                } catch (Exception e) {
                    e.printStackTrace(); //如果出现异常的话，一会再请求，时间逐渐延长，达到一定次数 //不在请求，将错误记录日志
                    return ConsumeConcurrentlyStatus.RECONSUME_LATER;
                }
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });
        //06启动消费者
        consumer.start();
        System.out.println("消费者启动了");
    }
}
