package com.sacavix.mq.dummy;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Data implements Serializable {

   private static final long serialVersionUID = 1L;
   private long id;	 
   private String message;
}
