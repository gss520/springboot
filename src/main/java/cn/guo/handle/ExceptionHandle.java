package cn.guo.handle;

import cn.guo.domain.Result;
import cn.guo.exception.GirlException;
import cn.guo.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by acer on 2018/6/19.
 */

@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);


    @ExceptionHandler(value = Exception.class)    //申明捕获的异常类
    @ResponseBody       //返回json格式
    public Result handle(Exception e){
        if (e instanceof GirlException) {
            GirlException girlException = (GirlException) e;
            return ResultUtil.error(girlException.getCode(),girlException.getMessage());
        }else {
            logger.error("[系统异常]",e);
            return ResultUtil.error(-1, "未知错误");

        }
    }
}
