package com.ffshare.test;

import com.ffshare.test.cases.FileTestCase;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Java 函数测试
 * @author Mark
 * @version 1.0
 * @date 2021/4/28
 */
@SpringBootTest
public class JavaMainTest {

    @Test
    void FileTest(){
        FileTestCase.renameImagesName("D:\\temp\\iconavatar\\images\\repo\\s");
    }

}
