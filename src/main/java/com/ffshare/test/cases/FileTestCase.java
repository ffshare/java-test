package com.ffshare.test.cases;

import java.io.File;

/**
 * @author Mark
 * @version 1.0
 * @date 2021/4/26
 */
public class FileTestCase {


    /**
     * 获取目录下的文件列表
     * @param path
     * @return
     */
    private static String[] getFileName(String path)
    {
        File file = new File(path);
        String[] fileName = file.list();
        return fileName;
    }

    /**
     * 图片重命名
     * @param path
     * @param oldname
     * @param newname
     */
    private static void renameFile(String path, String oldname, String newname){
        if(!oldname.equals(newname)){//新的文件名和以前文件名不同时,才有必要进行重命名
            File oldfile=new File(path+"\\"+oldname);
            File newfile=new File(path+"\\"+newname);
            if(!oldfile.exists()){
                return;//重命名文件不存在
            }
            if(newfile.exists())//若在该目录下已经有一个文件和新文件名相同，则不允许重命名
                System.out.println(newname+"已经存在！");
            else{
                oldfile.renameTo(newfile);
            }
        }else{
            System.out.println("新文件名和旧文件名相同...");
        }
    }


    /**
     * 单个文件夹图片重命名
     * @param path
     */
    public static void renameImagesName(String path){
        String[] fileName = getFileName(path);//<span style="font-family: Arial, Helvetica, sans-serif;">此处修改为你的本地路径</span>
        for (int i = 0; i < fileName.length; i++) {
            renameFile(path, fileName[i], i+".jpg");//cx修改为你要修改的文件名格式
        }
    }

    public static void main(String[] args)
    {
        renameImagesName("D:\\temp\\iconavatar\\avatar\\images\\repo\\s");
    }

}
