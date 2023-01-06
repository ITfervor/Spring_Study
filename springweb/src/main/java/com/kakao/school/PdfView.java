//package com.kakao.school;
//
//import java.util.List;
//import java.util.Map;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Table;
//import org.springframework.web.servlet.view.document.AbstractPdfView;
//
//import com.kakao.school.dto.ItemDTO;
//import com.lowagie.text.Document;
//import com.lowagie.text.pdf.PdfWriter;
//
//public class PdfView extends AbstractPdfView {
//
//	@Override
//	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
//			HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		//전달된 데이터 가져오기
//		List<ItemDTO>list = (List<ItemDTO>)model.get("list");
//		
//		//테이블에 출력
//		Table table = new Table(3, list.size() + 1);
//		table.setPadding(5);
//		
//		//한글을 사용하기 위해서는 한글이 지원되는 폰트를 설정
//		BaseFont bfkKorean = BaseFont.createFont(request.getRealPath("/") + "/malgun.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
//		
//		Font font = new Font(bfKorean);
//		
//		Cel
//		
//		cell = firstRow.createCell(1);
//		cell.setCellValue("설명");
//		
//		cell = firstRow.createCell(2);
//		cell.setCellValue("가격");
//	}
//
//	
//}
