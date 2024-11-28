package com.yakub.repo;

import com.yakub.model.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobileRepo extends JpaRepository<Mobile, Integer> {
}
