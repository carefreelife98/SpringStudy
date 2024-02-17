package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

            // @Slf4j 애노테이션으로 로그 인터페이스의 생성을 간단하게 대체할 수 있음.
    //    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Carefree";

        // 운영 서버든 개발 서버든 모든곳에서 흔적을 남긴다.
        // 많은 트래픽 생성시 필요없는 데이터가 쌓이게 된다.


        System.out.println("name = " + name);

        log.trace(" info log={}", name);
        log.debug(" info log={}", name);
        log.info(" info log={}", name);
        log.warn(" info log={}", name);
        log.error(" info log={}", name);

        return "ok";
    }
}
