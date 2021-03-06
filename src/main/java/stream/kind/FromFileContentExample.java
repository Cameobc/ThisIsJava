package stream.kind;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExample {

    // 파일 내용을 소스로 하는 스트림
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C://src/linedata.txt");
        Stream<String> stream;

        // Files.lines() 메소드 이용
        // 운영 체제 기본 문자셋
        stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach(System.out :: println);
        System.out.println();

        //BufferedReader 의 lines() 메소드 이용
        File file = path.toFile();
        FileReader fe = new FileReader(file);
        BufferedReader br = new BufferedReader(fe);
        stream = br.lines();
        stream.forEach(System.out :: println);
    }


}
