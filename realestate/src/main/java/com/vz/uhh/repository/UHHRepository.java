package com.vz.uhh.repository;

import com.vz.uhh.model.Members;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UHHRepository extends JpaRepository<Members, Long> {

}
