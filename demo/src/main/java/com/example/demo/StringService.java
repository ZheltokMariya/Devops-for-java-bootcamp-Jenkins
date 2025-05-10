package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class StringService
{
    public int getLength(String string)
    {
        return string.length();
    }
}
