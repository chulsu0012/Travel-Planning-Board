package com.release.core.repository;

import com.release.core.model.Bookmark;

public interface BookmarkRepository {
    
    //등록
    public void doBookmark(Bookmark bookmark);

    //조회
    public void loadBookmark(Bookmark bookmark);

    //삭제
    public void deleteBookmark(int bookmarkId, int userId);

}