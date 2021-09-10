package domain.service;

import infrastructure.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhuxiaofeng
 * @date 2021/9/9
 */
@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

}
