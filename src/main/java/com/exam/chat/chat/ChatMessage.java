package com.exam.chat.chat;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder//이거 이펙티브 자바에서 본 빌더 패턴을 자동으로 생성해줌
public class ChatMessage {

    private String content;
    private String sender;
    private MessageType messageType;
}
