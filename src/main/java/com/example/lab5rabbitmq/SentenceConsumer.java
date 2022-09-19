package com.example.lab5rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class SentenceConsumer {
    protected Sentence sentences;

    public SentenceConsumer() {
        this.sentences = new Sentence();
    }
    @RabbitListener(queues = "BadWordQueue")
    public void addBadSentence(String s) {
        System.out.println(s + " : Add Bad Sentence");
        this.sentences.badSentences.add(s);
        for(int i=0; i<this.sentences.badSentences.size(); i++) {
            System.out.println(this.sentences.badSentences.get(i));
        }
    }
//    @RabbitListener(queues = "GetSen")
//    public Sentence getGG(String s){
//        return this.sentences;
//    }
}
