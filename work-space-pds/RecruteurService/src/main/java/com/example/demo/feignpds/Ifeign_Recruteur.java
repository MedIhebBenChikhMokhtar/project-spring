package com.example.demo.feignpds;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entities.Offre;
@FeignClient ("OffreEmploiService")
public interface Ifeign_Recruteur {
	
	@RequestMapping(method= RequestMethod.GET, value= "/recruteurr/{recId}")
	List<Offre> GetOffress(@PathVariable("recId") String recId);

}
