package application.service;

import domain.service.TestService;
import infrastructure.external.TestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhuxiaofeng
 * @date 2021/9/9
 */
@Service
public class TestAppService {

    @Autowired
    private TestClient testClient;

    @Autowired
    private TestService testService;

}
