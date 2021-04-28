package com.ffshare.test;

import com.ffshare.test.cases.FileCase;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Java 函数测试
 * @author Mark
 * @version 1.0
 * @date 2021/4/28
 */
@SpringBootTest
public class JavaCaseTest {

    @Test
    void FileTest(){
        FileCase.renameImagesName("D:\\temp\\iconavatar\\images\\repo\\s");
    }

}
