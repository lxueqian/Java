package javaCase.demo0327.FileBasic;

import java.io.File;
import java.io.FileFilter;

/*创建FileFilter实现类，重写过滤方法accept*/
public class DemoFileFilter implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        if(pathname.isDirectory()){
            return true;
        }
        return pathname.toString().toLowerCase().endsWith(".java");
    }
}
