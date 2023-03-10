package com.kakao.school.sevice;

import java.util.List;

import com.kakao.school.domain.ItemEntity;
import com.kakao.school.dto.ItemDTO;


public interface ItemService {
	//전체 데이터를 가져오는 메서드
	public List<ItemDTO> allItem();
	
	//DTO를 Entity로 변환하는 메서드
	public default ItemEntity dtoToEntity(ItemDTO dto) {
		ItemEntity entity = ItemEntity.builder()
				.itemid(dto.getItemid())
				.itemname(dto.getItemname())
				.description(dto.getDescription())
				.pictureurl(dto.getPictureurl())
				.price(dto.getPrice())
				.build();
		return entity;
	}
	//g하나의 데이터를 가져오는 메서
	public ItemDTO getItem(int itemid);
	
	//Entity를 DTO로 변환하는 메서드
	public default ItemDTO entityToDTO(ItemEntity entity) {
		ItemDTO dto = ItemDTO.builder()
				.itemid(entity.getItemid())
				.itemname(entity.getItemname())
				.description(entity.getDescription())
				.pictureurl(entity.getPictureurl())
				.price(entity.getPrice())
				.build();
		return dto;
	}
}


