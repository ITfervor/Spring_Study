package com.kakao.school.sevice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.kakao.school.domain.ItemEntity;
import com.kakao.school.dto.ItemDTO;
import com.kakao.school.persistence.ItemMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
	@Autowired
	private  ItemMapper itemMapper;

	@Override
	public List<ItemDTO> allItem() {
		List<ItemDTO> list = new ArrayList<>();
		//Repository 메서드 호출
		List<ItemEntity> result = itemMapper.allItem();
		//결과 변환
		for(ItemEntity entity : result) {
			list.add(entityToDTO(entity));
		}
		return list;
	}

	
	@Override
	public ItemDTO getItem(int itemid) {
		ItemDTO dto = null;
		
		ItemEntity entity = itemMapper.getItem(itemid);
		if(entity != null) {
			dto = entityToDTO(entity);
			
		}
		return dto;
	}
}







