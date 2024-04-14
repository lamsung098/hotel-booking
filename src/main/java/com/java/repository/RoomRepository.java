package com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.java.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{

}