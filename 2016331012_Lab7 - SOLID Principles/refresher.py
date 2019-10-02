import os

def deleteFiles(dir, ext):
    print(dir)
    files = os.listdir(dir)
    for item in files:
        path = dir + "/" + item
        isFile = os.path.isfile(path)
        if(isFile==True):
            if(item.endswith(ext)):
                os.remove(path)
                print("deleted:: " + path)
        else:
            deleteFiles(path, ext)
            
        

curDir = os.getcwd()
# print(curDir)
deleteFiles(curDir, ".class")