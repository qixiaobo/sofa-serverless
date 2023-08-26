package com.alipay.sofa.serverless.arklet.springboot.actuator.info;

import com.alipay.sofa.ark.spi.model.Biz;
import com.alipay.sofa.ark.spi.model.Plugin;
import com.alipay.sofa.serverless.arklet.springboot.actuator.ActuatorComponent;
import com.alipay.sofa.serverless.arklet.springboot.actuator.health.model.HealthModel;
import com.alipay.sofa.serverless.arklet.springboot.actuator.info.model.BizModel;
import com.alipay.sofa.serverless.arklet.springboot.actuator.info.model.PluginModel;

import java.util.List;

/**
 * @author Lunarscave
 */
public interface MoudleInfoService extends ActuatorComponent {

    HealthModel queryMasterBiz();

    List<Biz> queryBizList();

    List<Plugin> queryPluginList();

    Biz getBizInfo(BizModel biz);

    Plugin getPluginInfo(PluginModel plugin);
}
