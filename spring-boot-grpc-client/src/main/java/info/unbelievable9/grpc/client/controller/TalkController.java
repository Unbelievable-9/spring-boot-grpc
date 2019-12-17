package info.unbelievable9.grpc.client.controller;

import info.unbelievable9.grpc.client.service.TalkClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author unbelievable9
 * @date 2019/12/16
 **/
@RestController
public class TalkController {

    private final TalkClientService talkClientService;

    @Autowired
    public TalkController(TalkClientService talkClientService) {
        this.talkClientService = talkClientService;
    }

    @GetMapping("/talk")
    public String talk(@RequestParam(defaultValue = "Unbelievable9") String name) {
        return talkClientService.sayHello(name);
    }
}
