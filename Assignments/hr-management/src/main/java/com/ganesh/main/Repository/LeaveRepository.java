package com.ganesh.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ganesh.main.Entity.Leave;

@Repository
public interface LeaveRepository extends JpaRepository<Leave, Long> {



}
