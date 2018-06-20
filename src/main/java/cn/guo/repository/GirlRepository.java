package cn.guo.repository;

import cn.guo.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author guoshuaishuai
 * Created by Administrator on 2018-06-07 19:58.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {


    //通过年龄来查询
   public List<Girl> findByAge(Integer age);
}
