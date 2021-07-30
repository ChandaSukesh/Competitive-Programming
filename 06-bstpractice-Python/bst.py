class Node(object):
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

class BST(object):
    def __init__(self, root):
        self.root = Node(root)

    def insert(self, new_val):
        # Your code goes here
        if self.root==None:
            self.root=Node(new_val)
        else:
            rootVal=self.root
            upperVal=self.root

            while(rootVal!=None):
                upperVal=rootVal
                if new_val<rootVal.value:
                    rootVal=rootVal.left
                else:
                    rootVal=rootVal.right
            if new_val<upperVal.value:
                upperVal.left=Node(new_val)
            else:
                upperVal.right=Node(new_val)





    def printSelf(self):
        # Your code goes here
        print(self.root)
        
    def search(self, find_val):
        # Your code goes here
        while self.root!=None:
            if self.root.value==find_val:
                flag=True
                return flag
            elif self.root.value<find_val:
                self.root=self.root.right
            else:
                self.root=self.root.left
        return False

