package com.yks.demo;

import com.weibo.api.motan.common.MotanConstants;
import com.weibo.api.motan.core.extension.Activation;
import com.weibo.api.motan.core.extension.SpiMeta;
import com.weibo.api.motan.filter.Filter;
import com.weibo.api.motan.rpc.Caller;
import com.weibo.api.motan.rpc.Request;
import com.weibo.api.motan.rpc.Response;

@SpiMeta(name = "filter2")
@Activation(sequence = 80,key = {MotanConstants.NODE_TYPE_REFERER,MotanConstants.NODE_TYPE_SERVICE})
public class Filter2 implements Filter {
    @Override
    public Response filter(Caller<?> caller, Request request) {
        System.out.println("into filter2");
        return caller.call(request);
    }
}
