package collectionFramework.map.stackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();

        messageQueue.offer(new Message("sendMail", "z"));
        messageQueue.offer(new Message("sendSMS", "s"));
        messageQueue.offer(new Message("sendKakaoTalk", "hd"));

        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            switch (message.command){
                case "sendMail" :
                    System.out.println(message.to + " 님에게 메세지를 보냅니다. ");
                    break;
                case "sendSMS" :
                    System.out.println(message.to + " 님에게 SMS를 보냅니다. ");
                    break;
                case "sendKakaoTalk" :
                    System.out.println(message.to + " 님에게 KakaoTalk을 보냅니다. ");
                    break;
            }
        }
    }
}
