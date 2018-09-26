package com.tr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.tr.domain.Product;

public interface ProductMapper {
	
	@Select("select * from product")
    public List<Product> queryProducts();
	
	@Select("select * from product where id=#{id}")
	public Product queryProduct(String id);
	
	@Insert("insert into product(name,price,createtime,detail) values (#{name},#{price},#{createtime},#{detail})")
	public int insertProduct(Product product);
	
	@Delete("delete from product where id=#{id}")
	public int deleteProduct(String id);
	
	@Update("update product set name=#{name},price=#{price},createtime=#{createtime},detail=#{detail} where id=#{id}")
	public int updateProduct(Product product);
}
