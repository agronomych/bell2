package agronomych.bell.docs.controller;

import agronomych.bell.docs.dao.DocDao;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/docs", produces = APPLICATION_JSON_VALUE)
public class DocController {

    @Autowired
    private DocDao docDao;

    @GetMapping("/list")
    public String docsList(){
        //return docDao.loadByCode(1).getName();
        return "asa";
    }

    @ApiOperation(value = "id", nickname = "id",httpMethod = "GET")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody String get(@RequestParam() int id) {
        System.out.println(id);
        return Integer.toString(id);
    }

}
