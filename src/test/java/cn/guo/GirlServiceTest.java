package cn.guo;

import cn.guo.domain.Girl;
import cn.guo.service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by acer on 2018/6/19.
 */

@RunWith(SpringRunner.class)  //在测试环境里跑
@SpringBootTest   //启动整个spring工程
public class GirlServiceTest {

    @Autowired
    private GirlService girlService;

    @Test
    public void findOneTest(){
        Girl girl = girlService.findOne(117);
        Assert.assertEquals(new Integer(9),girl.getAge());
    }
}
