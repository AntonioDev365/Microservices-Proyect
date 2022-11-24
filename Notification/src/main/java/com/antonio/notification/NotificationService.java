package com.antonio.notification;

import com.antonio.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class NotificationService {
    public NotificationRepository notificationRepository;
    public void send(NotificationRequest notificationRequest){
        notificationRepository.save(Notification.builder().toCustomerId(notificationRequest.toCustomerId())
                .toCustomerEmail(notificationRequest.toCustomerName()).sender("Antonio")
                .message(notificationRequest.message()).sentAt(LocalDateTime.now()).build());
    }
}
