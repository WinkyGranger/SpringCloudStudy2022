package com.winky.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @auther Li Wenjie
 * @create 2022-01-02 21:12
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable {  //序列化，后面分布式部署可能用得到
    private Long id;
    private String serial;
}
