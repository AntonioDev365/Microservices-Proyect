package com.antonio.notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface NotificationRepository extends JpaRepository<Notification, Integer> {

}
