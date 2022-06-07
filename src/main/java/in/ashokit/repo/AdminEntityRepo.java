package in.ashokit.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.AdminEntity;

@Repository
public interface AdminEntityRepo extends JpaRepository<AdminEntity, Integer>{

}
