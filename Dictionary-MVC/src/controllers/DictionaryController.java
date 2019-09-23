package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {

    @PostMapping("/translate")
    public String translate(@RequestParam String txtSearch, ModelMap model){
        model.put("hello", "Xin chào");
        model.put("goodbye", "Tạm biệt");
        model.put("book", "Quyển sách");
        model.put("run", "Chạy");

        String result = (String) model.get(txtSearch);

        if (result != null){
            model.addAttribute("txtSearch",txtSearch);
            model.addAttribute("result", result);
        }

        return "result";
    }

}
