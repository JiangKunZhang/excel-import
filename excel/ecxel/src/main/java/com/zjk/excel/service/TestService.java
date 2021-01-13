package com.zjk.excel.service;


import org.springframework.web.multipart.MultipartFile;

public interface TestService {

    boolean batchImport(String fileName, MultipartFile file) throws Exception;
    
}
