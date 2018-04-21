package com.ten_thousand.silver_paving.controller.lkc;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ten_thousand.silver_paving.dto.lkc.TbCar;
import com.ten_thousand.silver_paving.service.lkc.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/car")
public class CarController {
    @Autowired
    private ICarService carService;
    @RequestMapping("/carsave")
    public String save(@RequestParam("tbCar") TbCar tbCar){
        carService.save(tbCar);
        return "redirect:/carList";
    }

    @RequestMapping("/cardelete")
    public String delete(@RequestParam("carId") Integer carId){
        carService.delete(carId);
        return "redirect:/carList";
    }
    @RequestMapping("/carupdate")
    public String update(@RequestParam("carId") Integer carId){
        carService.update(carId);
        return "redirect:/carList";
    }

    @RequestMapping("/carList")
    public String byPageList(@RequestParam(value = "pg",defaultValue = "1")Integer pg, Map<String,Object> map){
        PageHelper.startPage(pg,5);
        List<TbCar> list = carService.queryAll();
        PageInfo<TbCar> carPageInfo = new PageInfo<>(list, 5);
        map.put("carPageinfo",carPageInfo);
        return "carList";
    }

    @RequestMapping("/carInfo")
    public String byIdInfo(@RequestParam("id")Integer id,Model model){
        TbCar tbCar = carService.queryById(id);
        model.addAttribute("tbCar",tbCar);
        return "carInfo";
    }

    @RequestMapping("/carCount")
    public String queryCount(Model model){
        int count = carService.queryCount();
        model.addAttribute("carCount",count);
        return "carList";
    }
}
