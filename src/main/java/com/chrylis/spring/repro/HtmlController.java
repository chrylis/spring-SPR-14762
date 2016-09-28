package com.chrylis.spring.repro;

import java.util.Collections;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chrylis.spring.repro.domain.Foo;

@Controller
@RequestMapping(path = "/api/foos", produces = MediaType.TEXT_HTML_VALUE)
public class HtmlController {

    @GetMapping("/{id}")
    public ModelAndView foo(@PathVariable Foo id) {
       return new ModelAndView("index", Collections.singletonMap("foo", id));
    }
}
