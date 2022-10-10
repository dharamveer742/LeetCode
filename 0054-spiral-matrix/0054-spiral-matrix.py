class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        left=0;
        right=len(matrix[0])-1
        up=0
        down=len(matrix)-1
        res=[]
        if len(matrix)==0:
            return res
        while(left<=right and up<=down):
            for i in range(left,right+1):
                res.append(matrix[up][i])
            up += 1
            for i in range(up,down+1):
                res.append(matrix[i][right])
            right -= 1
            if(up<=down):
                for i in range(right,left-1,-1):
                    res.append(matrix[down][i])
            down -= 1
            if(left<=right):
                for i in range(down,up-1,-1):
                    res.append(matrix[i][left])
            left += 1
        return res       
                    
            