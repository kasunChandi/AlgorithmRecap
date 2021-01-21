
def insertionSort(arr):
	for i in range(1, len(arr)):
		key = arr[i]
		j = i-1
		while j >=0 and key < arr[j] :
				arr[j+1] = arr[j]
				j -= 1
		arr[j+1] = key

arr = [1, 5, 11, 3, 5, 16]

insertionSort(arr)
print ("Sorted array value is:")
for i in range(len(arr)):
	print ("%d" %arr[i])
