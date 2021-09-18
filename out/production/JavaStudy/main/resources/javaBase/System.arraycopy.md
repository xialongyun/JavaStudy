# System.arraycopy

System.arraycopy方法：如果是数组比较大，那么使用System.arraycopy会比较有优势，因为其使用的是内存复制，省去了大量的数组寻址访问等时间

```
public static native void arraycopy(Object src,  int  srcPos,Object dest, int destPos,int length);
```

复制指定源数组src到目标数组dest。**复制从src的srcPos索引开始**，复制的个数是length，复制到dest的索引从destPos开始。