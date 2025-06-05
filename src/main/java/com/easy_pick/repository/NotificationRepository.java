package com.easy_pick.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easy_pick.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {



}
