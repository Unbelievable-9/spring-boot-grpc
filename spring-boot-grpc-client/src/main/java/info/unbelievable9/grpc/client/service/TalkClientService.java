package info.unbelievable9.grpc.client.service;

import info.unbelievable9.grpc.common.Talk;
import info.unbelievable9.grpc.common.TalkServiceGrpc;
import io.grpc.StatusRuntimeException;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
import org.springframework.stereotype.Service;

/**
 * @author unbelievable9
 * @date 2019/12/16
 **/
@Service
public class TalkClientService {

    @GrpcClient("talk-service-client")
    private TalkServiceGrpc.TalkServiceBlockingStub talkServiceBlockingStub;

    public String sayHello(final String name) {
        try {
            final Talk.ReplyMessage replyMessage =
                    this.talkServiceBlockingStub.sayHello(
                            Talk.GreetingMessage
                                    .newBuilder()
                                    .setName(name)
                                    .build()
                    );

            return replyMessage.getMessage();
        } catch (final StatusRuntimeException e) {
            return "Failed, status code: " + e.getStatus().getCode().name();
        }
    }
}
