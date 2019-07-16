package com.imooc.dataobject.mapper;

import com.imooc.dataobject.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryMapperTest {
    @Autowired
    ProductCategoryMapper mapper;
    @Test
    public void insertByMap() throws Exception {
        Map<String,Object>map=new HashMap<>();
        map.put("categoryName","儿童喜爱");
        map.put("categoryType",101);
        int result=mapper.insertByMap(map);
        Assert.assertEquals(1,result);
    }

    @Test
    public void insertByObject() throws Exception {
        ProductCategory productCategory=new ProductCategory();
        productCategory.setCategoryName("老人喜爱");
        productCategory.setCategoryType(102);
        int result=mapper.insertByObject(productCategory);
        Assert.assertEquals(1,result);
    }

    @Test
    public void findByCategoryType() throws Exception {
        ProductCategory result = mapper.findByCategoryType(102);
        Assert.assertNotNull(result);
    }

}