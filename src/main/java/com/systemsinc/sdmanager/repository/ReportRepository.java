package com.systemsinc.sdmanager.repository;

import com.systemsinc.sdmanager.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Kashif Ur Rehman
 */
@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {
}
