/**
 * FileName: OrderController
 * Author:   liaocm
 * Date:     2020/3/30 0030 20:56
 * Description:
 * History:
 */
package cn.lcm.consumer;

import cn.lcm.api.GoodApi;
import com.alibaba.dubbo.config.annotation.Reference;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Reference
    private GoodApi goodApi;

    @RequestMapping("submitOrder")
    public String submitOrder() {
        log.info("处理订单");

        log.info(goodApi.reduceStock());

        return "处理成功";
    }
}
