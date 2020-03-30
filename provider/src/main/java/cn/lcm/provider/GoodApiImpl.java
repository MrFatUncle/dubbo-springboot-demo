/**
 * FileName: GoodApiImpl
 * Author:   liaocm
 * Date:     2020/3/30 0030 21:03
 * Description:
 * History:
 */
package cn.lcm.provider;

import cn.lcm.api.GoodApi;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class GoodApiImpl implements GoodApi {
    @Override
    public String reduceStock() {
        System.out.println("处理库存");
        return "库存减少";
    }
}
