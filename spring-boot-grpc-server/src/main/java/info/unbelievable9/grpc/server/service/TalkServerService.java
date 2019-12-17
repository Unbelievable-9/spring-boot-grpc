package info.unbelievable9.grpc.server.service;

import info.unbelievable9.grpc.common.Talk;
import info.unbelievable9.grpc.common.TalkServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;

/**
 * @author unbelievable9
 * @date 2019/12/16
 **/
@GrpcService(TalkServiceGrpc.class)
public class TalkServerService extends TalkServiceGrpc.TalkServiceImplBase {

    @Override
    public void sayHello(Talk.GreetingMessage request, StreamObserver<Talk.ReplyMessage> responseObserver) {
        Talk.ReplyMessage replyMessage =
                Talk.ReplyMessage
                        .newBuilder()
                        .setMessage("Hello: " + request.getName())
                        .build();

        responseObserver.onNext(replyMessage);
        responseObserver.onCompleted();
    }
}
