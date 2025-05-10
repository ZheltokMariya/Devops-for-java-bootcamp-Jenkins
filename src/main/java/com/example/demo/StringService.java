package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class StringService
{
    public int getLength(String string)
    {
        if (string == null) {
            return string.length();
        }
        return string.length();
    }
}
