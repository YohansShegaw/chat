//package com.chat.config;
//
//import org.springframework.context.event.EventListener;
//import org.springframework.messaging.handler.annotation.Payload;
//import org.springframework.messaging.simp.SimpMessageSendingOperations;
//import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
//import org.springframework.stereotype.Component;
//import org.springframework.web.socket.messaging.SessionDisconnectEvent;
//
//import com.chat.controller.ChatMessage;
//import com.chat.controller.MessageType;
//
//import lombok.extern.slf4j.Slf4j;
//
//@Component
//@Slf4j
//public class WebSocketEventListener {
//
//	private final SimpMessageSendingOperations messageTemplet = null;
//	
//	@EventListener
//	private void handleWebSocketDisconnectListener(SessionDisconnectEvent event) {
//		StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(event.getMessage());
//		String username = (String) headerAccessor.getSessionAttributes().get("username");
//		if(username != null) {
//			ChatMessage chatMessage = new ChatMessage();
//			 chatMessage.setType(MessageType.LEAVE);
//			 chatMessage.setSender(username);
//			 messageTemplet.convertAndSend("/topic/public",chatMessage);
//			 
//		}
//	}
//}
