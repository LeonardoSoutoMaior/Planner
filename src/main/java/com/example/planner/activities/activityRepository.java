package com.example.planner.activities;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface activityRepository extends JpaRepository<Activity, UUID> {
}
