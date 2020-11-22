package com.bundesreport.config;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AjaxResponse {

	List<String> msgs = new ArrayList<>();

	boolean like = false;
}
